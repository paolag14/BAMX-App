package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAbarrotesBindingImpl extends ActivityAbarrotesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmask, 2);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 3);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 4);
        sViewsWithIds.put(R.id.frameStackarrowleft, 5);
        sViewsWithIds.put(R.id.imageArrowleft, 6);
        sViewsWithIds.put(R.id.imageBamxlogoTwoOne, 7);
        sViewsWithIds.put(R.id.imageImageFiftyOne, 8);
        sViewsWithIds.put(R.id.txtH5, 9);
        sViewsWithIds.put(R.id.scrollView, 10);
        sViewsWithIds.put(R.id.fragment1, 11);
        sViewsWithIds.put(R.id.fragment2, 12);
        sViewsWithIds.put(R.id.fragment3, 13);
        sViewsWithIds.put(R.id.fragment4, 14);
        sViewsWithIds.put(R.id.fragment5, 15);
        sViewsWithIds.put(R.id.fragment6, 16);
        sViewsWithIds.put(R.id.fragment7, 17);
        sViewsWithIds.put(R.id.btnDonar, 18);
        sViewsWithIds.put(R.id.frameBottombar, 19);
        sViewsWithIds.put(R.id.linear2FourupAO, 20);
        sViewsWithIds.put(R.id.linear1Tab, 21);
        sViewsWithIds.put(R.id.imageHome, 22);
        sViewsWithIds.put(R.id.txtCaption, 23);
        sViewsWithIds.put(R.id.linearColumnvolume, 24);
        sViewsWithIds.put(R.id.linear3Tab, 25);
        sViewsWithIds.put(R.id.imageVolume, 26);
        sViewsWithIds.put(R.id.txtCaptionOne, 27);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAbarrotesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ActivityAbarrotesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (androidx.fragment.app.FragmentContainerView) bindings[11]
            , (androidx.fragment.app.FragmentContainerView) bindings[12]
            , (androidx.fragment.app.FragmentContainerView) bindings[13]
            , (androidx.fragment.app.FragmentContainerView) bindings[14]
            , (androidx.fragment.app.FragmentContainerView) bindings[15]
            , (androidx.fragment.app.FragmentContainerView) bindings[16]
            , (androidx.fragment.app.FragmentContainerView) bindings[17]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ScrollView) bindings[10]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[9]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.linearSeleccinalime.setTag(null);
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
        if (BR.selecciNAlimentosVM == variableId) {
            setSelecciNAlimentosVM((com.application.app.modules.seleccinalimentos.data.viewmodel.SelecciNAlimentosVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelecciNAlimentosVM(@Nullable com.application.app.modules.seleccinalimentos.data.viewmodel.SelecciNAlimentosVM SelecciNAlimentosVM) {
        this.mSelecciNAlimentosVM = SelecciNAlimentosVM;
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

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_4), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): selecciNAlimentosVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}