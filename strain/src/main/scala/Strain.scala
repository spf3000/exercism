object Strain{

  def keep[A](coll: Seq[A], f: A => Boolean): Seq[A] = coll.filter(f)

  def discard[A](coll: Seq[A], f: A => Boolean): Seq[A] = coll.filterNot(f)

}