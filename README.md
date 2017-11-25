GPHR
====

This project is a work in progress implementation of 
the [Gopher][0], in accordance to [RFC 1436][1], in 
Java. The java version has to be at least version 8 
or greater, in order to support the [Stream API][2],
which is/will be used extensivly. The goal is to provide 
a clean, stable and fast library to interface with Gopher 
servers, as well as provide a structure for content to 
be served via Gopher.

The project is currently maintained and being developed 
by [Philip K.][3]

Goals
-----

Beyond just providing a library to communicate and process
with the Gopher network, this project (and it's developers)
sees itself as part of the modern movement to revive Gopher
for the late, mid-early 21st century, and if possible provide
a serious alternative to the overmisabused *word wide web*.

We recognize that Gopher isn't ideal, and that if it had been
in the place of the HTTP/HTML in the early 90's, it would have 
probably also have had the same fate. We hope to be able to use 
this experiance, and try to prevent this happening with our 
alternative. We don't expect success, fame or mass adoption, but 
rather are interested in proving an cleaner, more structured and
simpler alternative is possible - and that the web can do so to.

To be done
----------

- Implement more item types
- Create a server interface
- Write test cases
- Support Gopher+ and/or other extentions
- Simplify where possible

Please note that the code is still under heavy development,
(ie. pre version 0.0 alpha), and hence one shouldn't rely
too much on function signatures staying the way they are. 
Bugs should be expected and respected. Anything can and will
change, if necessary.

Legal
-----

To be decided. Will probably end up being placed in the 
public domain or will be published under (L)GPL, 2-clause 
BSD.

[0]: https://en.wikipedia.org/wiki/Gopher_(protocol)
[1]: https://tools.ietf.org/html/rfc1436
[2]: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
[3]: https://phi.k.vu/
