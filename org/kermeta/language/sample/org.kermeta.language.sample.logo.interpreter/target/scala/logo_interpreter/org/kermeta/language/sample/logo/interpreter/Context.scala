package `logo_interpreter`.org.kermeta.language.sample.logo.interpreter
trait Context extends `_root_`.k2.standard.KermetaObject{

    def initialize():_root_.scala.Unit
    def reset():_root_.scala.Unit
    def peek():_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]
    def pop():_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]
    def push(elem : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.Integer]):_root_.scala.Unit
}

