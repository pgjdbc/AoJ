module jdk.incubator.adba {
  uses jdk.incubator.sql2.DataSourceFactory;
  requires static transitive java.logging;
  exports jdk.incubator.sql2;
}