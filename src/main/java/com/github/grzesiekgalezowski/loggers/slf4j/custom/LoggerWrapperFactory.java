package com.github.grzesiekgalezowski.loggers.slf4j.custom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.ext.LoggerWrapper;

public final class LoggerWrapperFactory {

  private LoggerWrapperFactory() {

  }

  public static Logger getLogger(Class loggingClass, Class customLoggerClass) {
    return new LoggerWrapper(
        LoggerFactory.getLogger(loggingClass),
        customLoggerClass.getName());
  }

  public static <T> Logger getLogger(
      Class loggingClass,
      T customLoggerInstance) {
    return new LoggerWrapper(
        LoggerFactory.getLogger(loggingClass),
        customLoggerInstance.getClass().getName());
  }

}

