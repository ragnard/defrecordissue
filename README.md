defrecordissue
==============

Minimal demonstration of a, to me, unexpected behaviour of clojure
records.


Usage
=====

Two different lein aliases, `aot1` and `aot2` illustrate the
unexpected behaviour. They both first do a `lein clean` and then
compile either [`defrecordissue.aot1`](https://github.com/ragnard/defrecordissue/blob/master/src/defrecordissue/aot1.clj) or [`defrecordissue.aot2`](https://github.com/ragnard/defrecordissue/blob/master/src/defrecordissue/aot2.clj).

```
$ lein aot1
Compiling defrecordissue.aot1
Exception in thread "main" java.lang.IllegalArgumentException: No implementation of method: :afn of protocol: #'defrecordissue.aprotocol/AProtocol found for class: defrecordissue.arecord.ARecord, compiling:(aot1.clj:5:1)
	at clojure.lang.Compiler$InvokeExpr.eval(Compiler.java:3463)
	at clojure.lang.Compiler.compile1(Compiler.java:7153)
	at clojure.lang.Compiler.compile(Compiler.java:7219)
	at clojure.lang.RT.compile(RT.java:398)
	at clojure.lang.RT.load(RT.java:438)
	at clojure.lang.RT.load(RT.java:411)
	at clojure.core$load$fn__5018.invoke(core.clj:5530)
	at clojure.core$load.doInvoke(core.clj:5529)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invoke(core.clj:5336)
	at clojure.core$compile$fn__5023.invoke(core.clj:5541)
	at clojure.core$compile.invoke(core.clj:5540)
	at user$eval7.invoke(NO_SOURCE_FILE:1)
	at clojure.lang.Compiler.eval(Compiler.java:6619)
	at clojure.lang.Compiler.eval(Compiler.java:6609)
	at clojure.lang.Compiler.eval(Compiler.java:6582)
	at clojure.core$eval.invoke(core.clj:2852)
	at clojure.main$eval_opt.invoke(main.clj:308)
	at clojure.main$initialize.invoke(main.clj:327)
	at clojure.main$null_opt.invoke(main.clj:362)
	at clojure.main$main.doInvoke(main.clj:440)
	at clojure.lang.RestFn.invoke(RestFn.java:421)
	at clojure.lang.Var.invoke(Var.java:419)
	at clojure.lang.AFn.applyToHelper(AFn.java:163)
	at clojure.lang.Var.applyTo(Var.java:532)
	at clojure.main.main(main.java:37)
Caused by: java.lang.IllegalArgumentException: No implementation of method: :afn of protocol: #'defrecordissue.aprotocol/AProtocol found for class: defrecordissue.arecord.ARecord
	at clojure.core$_cache_protocol_fn.invoke(core_deftype.clj:541)
	at defrecordissue.aprotocol$fn__40$G__35__45.invoke(aprotocol.clj:5)
	at clojure.lang.AFn.applyToHelper(AFn.java:161)
	at clojure.lang.AFn.applyTo(AFn.java:151)
	at clojure.lang.Compiler$InvokeExpr.eval(Compiler.java:3458)
	... 25 more
Compilation failed: Subprocess failed
$
```


```
$ lein aot2
Compiling defrecordissue.aot2
$
```
