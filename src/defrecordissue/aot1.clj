(ns defrecordissue.aot1
  (:require [defrecordissue.aprotocol]
            [defrecordissue.arecord]))

;
; this won't work unless you update manualy a variable ->ARecord in the namespace
;
;(defrecordissue.aprotocol/afn (defrecordissue.arecord/->ARecord))
; 
; like

(defmacro from-ns[nmsps & body] 
  "launches body from namespace"
  `(binding 
     [*ns* (find-ns ~nmsps)] 
       (eval
          (quote (do ~@body)))))

(from-ns 'defrecordissue.arecord 
         (import '(defrecordissue.arecord.ARecord))
         (alter-var-root 
           ('->ARecord (ns-publics 'defrecordissue.arecord)) 
           (fn[x] (fn[] (new ARecord)))))

(println  (defrecordissue.aprotocol/afn (defrecordissue.arecord/->ARecord)))
; 42

