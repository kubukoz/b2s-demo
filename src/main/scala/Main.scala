enum Foo:
  case Bar
  case Baz(s: String)

@main def demo = println(Foo.Baz("hello"))
