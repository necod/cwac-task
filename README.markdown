CWAC Task: A Bit More Background Task Goodness
==============================================

The CWAC Task module presently offers `AsyncTaskEx` class,
which is Android's `AsyncTask` with a larger thread pool
and support for an unbounded work queue for backlogged
tasks. On the one hand, this is risky, in terms of bogging
down your device. On the other hand, this means you can
use `AsyncTaskEx` for situations where the exact number
of background jobs is unknowable and likely more than
10.

You use it just like `AsyncTask`, assuming you:

1. Put the JAR file (run `ant jar` to build one) in your
project (e.g., drop it in `libs/` for Ant to pick it up)
2. Reference `com.commonsware.cwac.task.AsyncTaskEx` instead
of `android.os.AsyncTask`.

Demo
----
In the `com.commonsware.cwac.task.demo` package you will find
a sample activity that demonstrates the use of `AsyncTaskEx`.

Note that when you build the JAR via `ant jar`, the sample
activity is not included, nor any resources -- only the
compiled classes for the actual library are put into the JAR.

License
-------
The code in this project is licensed under the Apache
Software License 2.0, per the terms of the included LICENSE
file.

Questions
---------
If you have questions regarding the use of this code, please
join and ask them on the cw-android Google Group. Be sure to
indicate which CWAC module you have questions about.
