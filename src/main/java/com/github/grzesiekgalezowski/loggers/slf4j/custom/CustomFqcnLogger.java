package com.github.grzesiekgalezowski.loggers.slf4j.custom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

import java.io.Serializable;

import static org.slf4j.spi.LocationAwareLogger.*;

@SuppressWarnings("unused")
public class CustomFqcnLogger implements Logger, Serializable {

  private static final long serialVersionUID = -2379157579049314822L;

  // used to store this logger's name to recreate it after serialization
  protected String name;

  // in both Log4jLogger and Jdk14Logger classes in the original JCL, the
  // logger instance is transient
  private transient LocationAwareLogger logger;

  private final String fqcn;

  public CustomFqcnLogger(
      Class loggingClass,
      final Class customLoggerClass) {
    this.logger = (LocationAwareLogger) LoggerFactory.getLogger(loggingClass);
    this.name = logger.getName();
    fqcn = customLoggerClass.getName();
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isTraceEnabled() {
    return logger.isTraceEnabled();
  }


  @Override
  public boolean isDebugEnabled() {
    return logger.isDebugEnabled();
  }

  @Override
  public boolean isInfoEnabled() {
    return logger.isInfoEnabled();
  }

  @Override
  public boolean isWarnEnabled() {
    return logger.isWarnEnabled();
  }

  @Override
  public boolean isErrorEnabled() {
    return logger.isErrorEnabled();
  }

  @Override
  public void trace(String message) {
    logger.log(null, fqcn, TRACE_INT, message, null, null);
  }

  @Override
  public void trace(final String format, final Object arg) {
    logger.log(null, fqcn, TRACE_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void trace(final String format, final Object arg1, final Object arg2) {
    logger.log(null, fqcn, TRACE_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void trace(final String format, final Object... arguments) {
    logger.log(null, fqcn, TRACE_INT, format, arguments, null);
  }

  @Override
  public void trace(String message, Throwable t) {
    logger.log(null, fqcn, TRACE_INT, String.valueOf(message), null, t);
  }

  @Override
  public boolean isTraceEnabled(final Marker marker) {
    return logger.isTraceEnabled(marker);
  }

  @Override
  public void trace(final Marker marker, final String msg) {
    logger.log(marker, fqcn, TRACE_INT, msg, null, null);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object arg) {
    logger.log(marker, fqcn, TRACE_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.log(marker, fqcn, TRACE_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object... argArray) {
    logger.log(marker, fqcn, TRACE_INT, format, argArray, null);
  }

  @Override
  public void trace(final Marker marker, final String msg, final Throwable t) {
    logger.log(marker, fqcn, TRACE_INT, msg, null, t);
  }

  @Override
  public void debug(String message) {
    logger.log(null, fqcn, DEBUG_INT, message, null, null);
  }

  @Override
  public void debug(final String format, final Object arg) {
    logger.log(null, fqcn, DEBUG_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void debug(final String format, final Object arg1, final Object arg2) {
    logger.log(null, fqcn, DEBUG_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void debug(final String format, final Object... arguments) {
    logger.log(null, fqcn, DEBUG_INT, format, arguments, null);
  }

  @Override
  public void debug(String message, Throwable t) {
    logger.log(null, fqcn, DEBUG_INT, message, null, t);
  }

  @Override
  public boolean isDebugEnabled(final Marker marker) {
    return logger.isDebugEnabled(marker);
  }

  @Override
  public void debug(final Marker marker, final String msg) {
    logger.log(marker, fqcn, DEBUG_INT, msg, null, null);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object arg) {
    logger.log(marker, fqcn, DEBUG_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.log(marker, fqcn, DEBUG_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object... arguments) {
    logger.log(marker, fqcn, DEBUG_INT, format, arguments, null);
  }

  @Override
  public void debug(final Marker marker, final String msg, final Throwable t) {
    logger.log(marker, fqcn, DEBUG_INT, null, null, t);
  }

  @Override
  public void info(String message) {
    logger.log(null, fqcn, INFO_INT, message, null, null);
  }

  @Override
  public void info(final String format, final Object arg) {
    logger.log(null, fqcn, INFO_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void info(final String format, final Object arg1, final Object arg2) {
    logger.log(null, fqcn, INFO_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void info(final String format, final Object... arguments) {
    logger.log(null, fqcn, INFO_INT, format, arguments, null);
  }

  @Override
  public void info(String message, Throwable t) {
    logger.log(null, fqcn, INFO_INT, message, null, t);
  }

  @Override
  public boolean isInfoEnabled(final Marker marker) {
    return logger.isInfoEnabled(marker);
  }

  @Override
  public void info(final Marker marker, final String msg) {
    logger.log(marker, fqcn, INFO_INT, msg, null, null);
  }

  @Override
  public void info(final Marker marker, final String format, final Object arg) {
    logger.log(marker, fqcn, INFO_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.log(marker, fqcn, INFO_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void info(final Marker marker, final String format, final Object... arguments) {
    logger.log(marker, fqcn, INFO_INT, format, arguments, null);
  }

  @Override
  public void info(final Marker marker, final String msg, final Throwable t) {
    logger.log(marker, fqcn, INFO_INT, msg, null, t);
  }

  @Override
  public void warn(String message) {
    logger.log(null, fqcn, WARN_INT, message, null, null);
  }

  @Override
  public void warn(final String format, final Object arg) {
    logger.log(null, fqcn, WARN_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void warn(final String format, final Object... arguments) {
    logger.log(null, fqcn, WARN_INT, format, arguments, null);
  }

  @Override
  public void warn(final String format, final Object arg1, final Object arg2) {
    logger.log(null, fqcn, WARN_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void warn(String message, Throwable t) {
    logger.log(null, fqcn, WARN_INT, message, null, t);
  }

  @Override
  public boolean isWarnEnabled(final Marker marker) {
    return logger.isWarnEnabled(marker);
  }

  @Override
  public void warn(final Marker marker, final String msg) {
    logger.log(marker, fqcn, WARN_INT, msg, null, null);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object arg) {
    logger.log(marker, fqcn, WARN_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.log(marker, fqcn, WARN_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object... arguments) {
    logger.log(marker, fqcn, WARN_INT, format, arguments, null);
  }

  @Override
  public void warn(final Marker marker, final String msg, final Throwable t) {
    logger.log(marker, fqcn, WARN_INT, msg, null, t);
  }

  @Override
  public void error(String message) {
    logger.log(null, fqcn, ERROR_INT, message, null, null);
  }

  @Override
  public void error(final String format, final Object arg) {
    logger.log(null, fqcn, ERROR_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void error(final String format, final Object arg1, final Object arg2) {
    logger.log(null, fqcn, ERROR_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void error(final String format, final Object... arguments) {
    logger.log(null, fqcn, ERROR_INT, format, arguments, null);
  }

  @Override
  public void error(String message, Throwable t) {
    logger.log(null, fqcn, ERROR_INT, message, null, t);
  }

  @Override
  public boolean isErrorEnabled(final Marker marker) {
    return logger.isErrorEnabled(marker);
  }

  @Override
  public void error(final Marker marker, final String msg) {
    logger.log(marker, fqcn, ERROR_INT, msg, null, null);
  }

  @Override
  public void error(final Marker marker, final String format, final Object arg) {
    logger.log(marker, fqcn, ERROR_INT, format, new Object[] {arg}, null);
  }

  @Override
  public void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.log(marker, fqcn, ERROR_INT, format, new Object[] {arg1, arg2}, null);
  }

  @Override
  public void error(final Marker marker, final String format, final Object... arguments) {
    logger.log(marker, fqcn, ERROR_INT, format, arguments, null);
  }

  @Override
  public void error(final Marker marker, final String msg, final Throwable t) {
    logger.log(marker, fqcn, ERROR_INT, msg, null, t);
  }
}
