package io.playdata.springboot04.repository;

import io.playdata.springboot04.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository<엔터티(model),ID의 타입>
public interface ProductRepository extends JpaRepository<Product, Long> {
    // TODO : 생성 규칙에 따른 커스텀 메소드
    // TODO : 쿼리를 직접 넣어서 Native Query 작동
}
