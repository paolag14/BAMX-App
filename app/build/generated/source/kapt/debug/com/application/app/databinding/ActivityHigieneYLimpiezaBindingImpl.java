package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHigieneYLimpiezaBindingImpl extends ActivityHigieneYLimpiezaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmask, 3);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 4);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 5);
        sViewsWithIds.put(R.id.frameStackarrowleft, 6);
        sViewsWithIds.put(R.id.imageArrowleft, 7);
        sViewsWithIds.put(R.id.txtH5, 8);
        sViewsWithIds.put(R.id.spinnerListBoxMain, 9);
        sViewsWithIds.put(R.id.frameAInactiveEna26, 10);
        sViewsWithIds.put(R.id.higieneCantidadText, 11);
        sViewsWithIds.put(R.id.imageLabelFour6, 12);
        sViewsWithIds.put(R.id.linearLabel26, 13);
        sViewsWithIds.put(R.id.txtLabelFive6, 14);
        sViewsWithIds.put(R.id.lineUpperSurfaceTwo6, 15);
        sViewsWithIds.put(R.id.frameAInactiveEna1, 16);
        sViewsWithIds.put(R.id.higieneDescripciónText, 17);
        sViewsWithIds.put(R.id.imageLabelFour, 18);
        sViewsWithIds.put(R.id.linearLabel2, 19);
        sViewsWithIds.put(R.id.txtLabelFive1, 20);
        sViewsWithIds.put(R.id.lineUpperSurfaceTwo, 21);
        sViewsWithIds.put(R.id.btnEnviar, 22);
        sViewsWithIds.put(R.id.frameBottombar, 23);
        sViewsWithIds.put(R.id.linear2FourupAO, 24);
        sViewsWithIds.put(R.id.linear1Tab, 25);
        sViewsWithIds.put(R.id.imageHome, 26);
        sViewsWithIds.put(R.id.txtCaption, 27);
        sViewsWithIds.put(R.id.linearColumnvolume, 28);
        sViewsWithIds.put(R.id.linear3Tab, 29);
        sViewsWithIds.put(R.id.imageVolume, 30);
        sViewsWithIds.put(R.id.txtCaptionOne, 31);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHigieneYLimpiezaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private ActivityHigieneYLimpiezaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[22]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[23]
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[17]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[30]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[15]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.Spinner) bindings[9]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[14]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearHigieneylimpi.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.higieneYLimpiezaVM == variableId) {
            setHigieneYLimpiezaVM((com.application.app.modules.higieneylimpieza.data.viewmodel.HigieneYLimpiezaVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHigieneYLimpiezaVM(@Nullable com.application.app.modules.higieneylimpieza.data.viewmodel.HigieneYLimpiezaVM HigieneYLimpiezaVM) {
        this.mHigieneYLimpiezaVM = HigieneYLimpiezaVM;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_12), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_13), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): higieneYLimpiezaVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}