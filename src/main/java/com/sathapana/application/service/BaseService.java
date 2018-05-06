package com.sathapana.application.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author chhaichivon on 5/6/18
 */
public interface BaseService<T> {

    T insert(T entity);

    Page<T> findAll(PageRequest pageRequest);
}
