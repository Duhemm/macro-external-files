package macros
import scala.language.experimental.macros
import scala.reflect.macros._

object Provider {

  def dummyMacro: String = macro dummyMacroImpl

  def dummyMacroImpl(c: Context): c.Tree = {
    import c.universe._
    import compat._
    val file = new java.io.File("utils/utils.txt")
    val lines = scala.io.Source.fromFile(file).mkString

    val map = new java.util.HashMap[String, Any]
    map.put("touchedFiles", file :: Nil)

    val tree = q"$lines"

    tree.updateAttachment(map)
  }
}