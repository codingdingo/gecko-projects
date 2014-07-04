/* -*- Mode: Java; c-basic-offset: 4; tab-width: 20; indent-tabs-mode: nil; -*-
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.gecko;

import android.content.Context;

public class PrivateTab extends Tab {
    public PrivateTab(Context context, int id, String url, boolean external, int parentId, String title) {
        super(context, id, url, external, parentId, title);

        // Init background to background_private to ensure flicker-free
        // private tab creation. Page loads will reset it to white as expected.
        final int bgColor = context.getResources().getColor(R.color.background_private);
        setBackgroundColor(bgColor);
    }

    @Override
    protected void saveThumbnailToDB() {}

    @Override
    public boolean isPrivate() {
        return true;
    }
}
