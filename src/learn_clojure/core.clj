(ns learn-clojure.core
  (:gen-class))

(defn Example []
  (def x 5)
  (def y 5.25)
  (println (type x))
  (println (type y)))

(Example)