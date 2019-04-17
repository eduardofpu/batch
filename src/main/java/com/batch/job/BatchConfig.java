package com.batch.job;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
//Essa classe ira configurar o Spring Batch
@Configuration
@EnableBatchProcessing //Ativa todos os recursos necessários do Spring Batch
public class BatchConfig extends DefaultBatchConfigurer {

    @Override
    public void setDataSource(DataSource dataSource) {
        // initialize will use a Map based JobRepository (instead of database)
    }
}
