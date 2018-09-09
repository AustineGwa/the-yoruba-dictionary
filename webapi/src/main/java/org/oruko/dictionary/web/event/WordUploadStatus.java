package org.oruko.dictionary.web.event;

import org.oruko.dictionary.events.WordUploadedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Dadepo Aderemi.
 */
@Component
public class WordUploadStatus {
    private Integer totalNumberOfNames;
    private Integer totalUploaded;
    private boolean isUploading = false;

    public void setStatus(WordUploadedEvent event) {

        if (event.isUploading()) {
            isUploading = true;
            totalNumberOfNames = event.getTotalNumberOfNames();
            totalUploaded = event.getTotalUploaded();
        } else {
            isUploading = false;
            totalNumberOfNames = 0;
            totalUploaded = 0;
        }

    }

    public Integer getTotalNumberOfNames() {
        return totalNumberOfNames;
    }

    public Integer getTotalUploaded() {
        return totalUploaded;
    }

    public boolean isUploading() {
        return isUploading;
    }
}
