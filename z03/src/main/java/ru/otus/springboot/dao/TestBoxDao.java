package ru.otus.springboot.dao;

import ru.otus.springboot.domain.TestItem;

import java.util.List;

public interface TestBoxDao {

    List<TestItem> getTestItemList( /*String filename*/ );

}