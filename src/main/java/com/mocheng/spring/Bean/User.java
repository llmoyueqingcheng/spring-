package com.mocheng.spring.Bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ls
 * @date 2021年03月14日 5:33 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    private String age;


}
