(ns demo
  (:require
   [three]
   ;;[three.controls.OrbitControls]
   ))

(js/console.log (str "three.js " three/REVISION))

;;; https://threejs.org/docs/index.html#manual/en/introduction/Creating-a-scene

(def scene (three.Scene.))

(def camera (three.PerspectiveCamera. 75
                                      (/ (.-innerWidth  js/window)
                                         (.-innerHeight js/window))
                                      0.1
                                      1000))

(def renderer (three.WebGLRenderer.))
(.setSize renderer
          (.-innerWidth  js/window)
          (.-innerHeight js/window))
(.appendChild (.-body js/document) (.-domElement renderer))

(def geometry (three.BoxGeometry.))

(def material (three.MeshBasicMaterial. (clj->js {:color 0x00ff00})))

(def cube (three.Mesh. geometry material))
(.add scene cube)

(set! (.. camera -position -z) 5)

(defn animate []
  (js/requestAnimationFrame animate)
  (set! (.. cube -rotation -x) (+ (.. cube -rotation -x) 0.01))
  (set! (.. cube -rotation -y) (+ (.. cube -rotation -y) 0.01))
  (.render renderer scene camera))

(animate)

;;; Add something from the examples directory

;;(def controls (three.controls.OrbitControls/OrbitControls. camera (.-domElement renderer)))
;;(.update controls)

(defn add-scene!
  "Adds more things to the global scene. You can call this function from the REPL,
  or, if you can evaluate code from your editor, you can try evaluating each
  expression in order."
  []

  (.set (.-position camera) 5 5 5)
  (.lookAt camera 0 0 0)

  (def grid-helper (three.GridHelper. 10 10))
  (.add scene grid-helper)

  (def axes-helper (three.AxesHelper. 5))
  (.add scene axes-helper)

  (def light (three.DirectionalLight. 0xffffff 1))
  (.add scene light)

  (def torus-geometry (three.TorusGeometry. 1 0.4 80 60))
  (def torus-material (three.MeshStandardMaterial. (clj->js {:color 0x3333ff})))
  (def torus (three.Mesh. torus-geometry torus-material))
  (.add scene torus)
  (.set (.-position torus) -2 1 -1)
  (.set (.-rotation torus) -0.8 0.6 0)

  (def plane-geometry (three.PlaneGeometry. 8 8))
  (def plane-material (three.MeshStandardMaterial. (clj->js {:color 0xff3333})))
  (def plane (three.Mesh. plane-geometry plane-material))
  (.add scene plane)
  (.set (.-position plane) -1 1 -2)
  (.set (.-rotation plane) -0.8 0.5 0)

  (def fog (three.Fog. 0x333333 1 30))
  (set! (.-fog scene) fog)

  )
