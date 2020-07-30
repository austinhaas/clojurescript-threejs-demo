(ns demo
  (:require
   [three]
   ["three/examples/jsm/controls/OrbitControls" :as oc]))

(set! *warn-on-infer* true)

(js/console.log (str "three.js " three/REVISION))

;;; https://threejs.org/docs/index.html#manual/en/introduction/Creating-a-scene

(def ^js scene (three/Scene.))

(def ^js camera (three/PerspectiveCamera. 75
                                          (/ (.-innerWidth  js/window)
                                             (.-innerHeight js/window))
                                          0.1
                                          1000))

(def ^js renderer (three/WebGLRenderer.))
(.setSize renderer
          (.-innerWidth  js/window)
          (.-innerHeight js/window))
(.appendChild (.-body js/document) (.-domElement renderer))

(def ^js geometry (three/BoxGeometry.))

(def ^js material (three/MeshBasicMaterial. (clj->js {:color 0x00ff00})))

(def ^js cube (three/Mesh. geometry material))
(.add scene cube)

(set! (.. camera -position -z) 5)

(defn animate []
  (js/requestAnimationFrame animate)
  (set! (.. cube -rotation -x) (+ (.. cube -rotation -x) 0.01))
  (set! (.. cube -rotation -y) (+ (.. cube -rotation -y) 0.01))
  (.render renderer scene camera))

(animate)

;;; Add something from the examples directory

(def ^js controls (oc/OrbitControls. camera (.-domElement renderer)))
(.update controls)

(defn add-scene!
  "Adds more things to the global scene. You can call this function from the REPL,
  or, if you can evaluate code from your editor, you can try evaluating each
  expression in order."
  []

  (.set (.-position camera) 5 5 5)
  (.lookAt camera 0 0 0)

  (def ^js grid-helper (three/GridHelper. 10 10))
  (.add scene grid-helper)

  (def ^js axes-helper (three/AxesHelper. 5))
  (.add scene axes-helper)

  (def ^js light (three/DirectionalLight. 0xffffff 1))
  (.add scene light)

  (def ^js torus-geometry (three/TorusGeometry. 1 0.4 80 60))
  (def ^js torus-material (three/MeshStandardMaterial. (clj->js {:color 0x3333ff})))
  (def ^js torus (three/Mesh. torus-geometry torus-material))
  (.add scene torus)
  (.set (.-position torus) -2 1 -1)
  (.set (.-rotation torus) -0.8 0.6 0)

  (def ^js plane-geometry (three/PlaneGeometry. 8 8))
  (def ^js plane-material (three/MeshStandardMaterial. (clj->js {:color 0xff3333})))
  (def ^js plane (three/Mesh. plane-geometry plane-material))
  (.add scene plane)
  (.set (.-position plane) -1 1 -2)
  (.set (.-rotation plane) -0.8 0.5 0)

  (def ^js fog (three/Fog. 0x333333 1 30))
  (set! (.-fog scene) fog)

  )
