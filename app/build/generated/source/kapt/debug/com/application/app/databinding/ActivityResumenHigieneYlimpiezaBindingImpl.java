package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityResumenHigieneYlimpiezaBindingImpl extends ActivityResumenHigieneYlimpiezaBinding  {

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
        sViewsWithIds.put(R.id.txtGraciasportu, 8);
        sViewsWithIds.put(R.id.frameAInactiveEna12, 9);
        sViewsWithIds.put(R.id.tipoHigiene, 10);
        sViewsWithIds.put(R.id.imageLabelFour22, 11);
        sViewsWithIds.put(R.id.linearLabel222, 12);
        sViewsWithIds.put(R.id.lineUpperSurfaceTwo22, 13);
        sViewsWithIds.put(R.id.frameAInactiveEna1, 14);
        sViewsWithIds.put(R.id.cantHigiene, 15);
        sViewsWithIds.put(R.id.imageLabelFour, 16);
        sViewsWithIds.put(R.id.linearLabel2, 17);
        sViewsWithIds.put(R.id.lineUpperSurfaceTwo, 18);
        sViewsWithIds.put(R.id.frameAInactiveEna2, 19);
        sViewsWithIds.put(R.id.nombreHigiene, 20);
        sViewsWithIds.put(R.id.imageLabelFour2, 21);
        sViewsWithIds.put(R.id.linearLabel22, 22);
        sViewsWithIds.put(R.id.lineUpperSurfaceTwo2, 23);
        sViewsWithIds.put(R.id.btn2, 24);
        sViewsWithIds.put(R.id.btn, 25);
        sViewsWithIds.put(R.id.frameBottombar, 26);
        sViewsWithIds.put(R.id.linear2FourupAO, 27);
        sViewsWithIds.put(R.id.linear1Tab, 28);
        sViewsWithIds.put(R.id.imageHome, 29);
        sViewsWithIds.put(R.id.txtCaption, 30);
        sViewsWithIds.put(R.id.linearColumnvolume, 31);
        sViewsWithIds.put(R.id.linear3Tab, 32);
        sViewsWithIds.put(R.id.imageVolume, 33);
        sViewsWithIds.put(R.id.txtCaptionOne, 34);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityResumenHigieneYlimpiezaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private ActivityResumenHigieneYlimpiezaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[25]
            , (androidx.appcompat.widget.AppCompatButton) bindings[24]
            , (android.widget.EditText) bindings[15]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[26]
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[33]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[13]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.EditText) bindings[20]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[8]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearMensajedonaci.setTag(null);
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
        if (BR.mensajeDonaciNVM == variableId) {
            setMensajeDonaciNVM((com.application.app.modules.mensajedonacin.data.viewmodel.MensajeDonaciNVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMensajeDonaciNVM(@Nullable com.application.app.modules.mensajedonacin.data.viewmodel.MensajeDonaciNVM MensajeDonaciNVM) {
        this.mMensajeDonaciNVM = MensajeDonaciNVM;
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

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_64x62), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_1), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mensajeDonaciNVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}