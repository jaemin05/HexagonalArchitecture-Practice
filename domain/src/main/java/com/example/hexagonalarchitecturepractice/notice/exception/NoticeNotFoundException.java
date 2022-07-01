package com.example.hexagonalarchitecturepractice.notice.exception;

import com.example.hexagonalarchitecturepractice.error.CustomException;
import com.example.hexagonalarchitecturepractice.error.ErrorCode;

public class NoticeNotFoundException extends CustomException {
    public static final CustomException EXCEPTION =
            new NoticeNotFoundException();

    private NoticeNotFoundException() {
        super(ErrorCode.NOTICE_NOT_FOUND);
    }
}
