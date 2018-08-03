package core

object Currying {
  def curry(f: (_) => _) = ???

  def curryLeft(f: (_*) => _, n: Int) = ???

  def curryRight(f: (_*) => _, n: Int) = ???

  def curryWithApplicationLeft(f: (_*) => _, n: Int, args: Seq[Any]) = ???

  def curryWithApplicationRight(f: (_*) => _, n: Int, args: Seq[Any]) = ???
}
