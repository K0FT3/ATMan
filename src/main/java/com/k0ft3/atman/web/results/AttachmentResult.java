package com.k0ft3.atman.web.results;

import com.k0ft3.atman.domain.common.file.FileUrlCreator;
import com.k0ft3.atman.domain.model.attachment.Attachment;
import com.k0ft3.atman.utils.ImageUtils;

import org.springframework.http.ResponseEntity;

public class AttachmentResult {

    public static ResponseEntity<ApiResult> build(Attachment attachment, FileUrlCreator fileUrlCreator) {
        String fileUrl = fileUrlCreator.url(attachment.getFilePath());
        ApiResult apiResult = ApiResult.blank().add("id", attachment.getId().value())
                .add("fileName", attachment.getFileName()).add("fileType", attachment.getFileType())
                .add("fileUrl", fileUrl).add("userId", attachment.getUserId().value())
                .add("createdDate", attachment.getCreatedDate().getTime());

        if (attachment.isThumbnailCreated()) {
            apiResult.add("previewUrl", ImageUtils.getThumbnailVersion(fileUrl));
        }
        return Result.ok(apiResult);
    }
}