(ns defrecordissue.arecord)

(defrecord ARecord [])

(defn make-record
  []
  ;; this fails:
  (->ARecord)
  ;; this works:
  ;; (ARecord.)
  )
