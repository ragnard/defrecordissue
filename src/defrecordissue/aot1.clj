(ns defrecordissue.aot1
  (:require [defrecordissue.aprotocol]
            [defrecordissue.arecord]))

(defrecordissue.aprotocol/afn (defrecordissue.arecord/->ARecord))
