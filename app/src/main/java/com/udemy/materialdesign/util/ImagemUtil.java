package com.udemy.materialdesign.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.udemy.materialdesign.adapter.ItemConteudoAdapter;

public class ImagemUtil {

    private final ItemConteudoAdapter itemPacoteAdapter;

    public ImagemUtil(ItemConteudoAdapter itemPacoteAdapter) {
        this.itemPacoteAdapter = itemPacoteAdapter;
    }

    public static Drawable recuperarImagem(Context context, String imagem) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(imagem, "drawable", context.getPackageName());
        return resources.getDrawable(identifier);
    }
}