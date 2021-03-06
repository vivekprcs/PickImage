package com.vansuita.pickimage.bean;

import android.graphics.Bitmap;
import android.net.Uri;

/**
 * Created by jrvansuita on 02/12/16.
 */

public class PickResult {
    private Bitmap bitmap;
    private Uri uri;
    private Exception error;


    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public Exception getError() {
        return error;
    }

    public void setError(Exception error) {
        this.error = error;
    }

    public PickResult(Bitmap bitmap, Uri uri, Exception error) {
        this.bitmap = bitmap;
        this.uri = uri;
        this.error = error;
    }

    public PickResult() {
    }
}
