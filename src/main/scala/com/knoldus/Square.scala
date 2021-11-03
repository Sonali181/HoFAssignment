package com.knoldus

trait Square {
  def squareList(xs: List[Int]): List[Int]
}

class squarelist extends Square{
  override def squareList(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => y * y :: squareList(ys)
  }
}

class SquareListMap extends Square{
  override def squareList(xs: List[Int]): List[Int] =
    xs.map(n => n * n)
}

object SquareRun extends App{
   val square = new squarelist
   println(square.squareList(List(1,8,5,6)))

  val squareHoF = new SquareListMap
  println(squareHoF.squareList(List(4,5,8,4)))
}

