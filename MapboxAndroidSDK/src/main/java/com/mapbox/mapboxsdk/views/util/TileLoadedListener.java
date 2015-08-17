/**
 * @author Brad Leege <bleege@gmail.com>
 * Created on 2/5/14 at 8:02 PM
 */

package com.mapbox.mapboxsdk.views.util;

import android.graphics.Bitmap;

import com.mapbox.mapboxsdk.tileprovider.MapTile;

public interface TileLoadedListener {
    public Bitmap onTileLoaded(Bitmap pBitmap, MapTile pTile);
}
