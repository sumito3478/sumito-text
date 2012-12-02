package sumito3478.collection.immutable

import java.lang.{ ThreadLocal => JThreadLocal }

trait ThreadLocal[+A] extends sumito3478.collection.ThraedLocal[A] {

}

object ThreadLocal {

  /**
   * Create an instance of ThreadLocal[A].
   *
   * @param f a function called to initialize the thread local value.
   * called only once per a thread.
   */
  def apply[A](f: () => A): ThreadLocal[A] = {
    new ThreadLocal[A] {
      val intern = new JThreadLocal[A] {
        protected[this] override def initialValue: A = {
          f()
        }
      }

      def apply(): A = {
        intern.get
      }
    }
  }
}

