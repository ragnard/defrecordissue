(ns defrecordissue.aprotocol
  (:require [defrecordissue.arecord])
  (:import [defrecordissue.arecord ARecord]))

(defprotocol AProtocol
  (afn [this]))

(extend-protocol AProtocol
  ARecord
  (afn [this] 42))
