package sumito3478.collection

import java.lang.{ ThreadLocal => JThreadLocal }

trait ThraedLocal[+A] {
  def apply(): A
}
