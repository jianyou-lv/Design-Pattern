package com.jianyou.observe.demo2;

public interface IObserver {

  void addObserver(IObserver observer);

  void deleteObserver(IObserver observer);

  void notifyObserver(String str);
}
