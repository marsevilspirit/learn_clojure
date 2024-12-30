(defn greet [name]
  (println (str "Hello, " name "!")))

(greet "world")

(defn messengers
  ([] (messengers "Hello world!"))
  ([msg] (println msg)))

(messengers)

(messengers "haha")

(defn hello [greeting & who]
  (println greeting who))

(hello "Hello" "world" "class")

;; aanonymous function
((fn [message] (println message)) "Hello, world!")

;; Equivalent to: (fn [x y & zs] (println x y zs))
#(println %1 %2 %&)
