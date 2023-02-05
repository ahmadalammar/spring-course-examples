package com.spring.professional.exam.tutorial.module01.question16.service;

import com.spring.professional.exam.tutorial.module01.question16.backup.DbRecordsBackup;
import com.spring.professional.exam.tutorial.module01.question16.bls.DbRecordsProcessor;
import com.spring.professional.exam.tutorial.module01.question16.non.beans.RecordsHash;
import com.spring.professional.exam.tutorial.module01.question16.reader.DbRecordsReader;
import com.spring.professional.exam.tutorial.module01.question16.writer.DbRecordsWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecordsService02 {

    @Autowired(required = false)
    public RecordsService02(DbRecordsReader recordsReader, DbRecordsBackup recordsBackup, DbRecordsProcessor recordsProcessor,
                            DbRecordsWriter recordsWriter,@Nullable RecordsHash recordsHash) {
        System.out.println(
                getClass().getSimpleName() + " recordsReaderrrrr = " + recordsReader + "\n" +
                        getClass().getSimpleName() + " recordsBackup = " + recordsBackup + "\n" +
                        getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n" +
                        getClass().getSimpleName() + " recordsWriter = " + recordsWriter + "\n"
        );
    }

}
