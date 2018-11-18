package io.getquill.context.jdbc

import io.getquill.context.Context
import io.getquill.context.sql.idiom.SqlIdiom
import io.getquill.context.sql.SqlContext
import io.getquill.monad.SyncIOMonad
import io.getquill.NamingStrategy
import io.getquill.util.ContextLogger
import java.io.Closeable
import java.sql.{ Connection, JDBCType, PreparedStatement, ResultSet }
import javax.sql.DataSource
import scala.annotation.tailrec
import scala.language.higherKinds
import scala.util.control.NonFatal
import scala.util.{ DynamicVariable, Try }

abstract class JdbcFs2Context[Dialect <: SqlIdiom, Naming <: NamingStrategy, F[_]](dataSource: DataSource with Closeable)
  extends Context[Dialect, Naming]
  with SqlContext[Dialect, Naming]
  with SyncIOMonad {
}
