package com.ywy.mall.ums.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by ywy on 2020/3/27
 */
@Configuration
public class ShardingJdbcConfiguration {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        return MasterSlaveDataSourceFactory
                .createDataSource(ResourceUtils.getFile("classpath:sharding.yml"));
    }
}
