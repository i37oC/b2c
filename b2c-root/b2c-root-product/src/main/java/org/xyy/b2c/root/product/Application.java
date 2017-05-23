package org.xyy.b2c.root.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xyy
 * @version 1.0 2017/5/22.
 * @since 1.0
 */
@SpringBootApplication
@MapperScan(value = "org.xyy.b2c.root.product.mapper" )
public class Application {


    public static void main(String[] args) {
        System.out.println("\n\n\n ==asdfasdfasdfa== \n\n\n");
        SpringApplication.run(Application.class, args);

    }
}
