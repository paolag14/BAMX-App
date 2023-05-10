package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMenPrincipalBindingImpl extends ActivityMenPrincipalBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameStackbamxlogoone, 2);
        sViewsWithIds.put(R.id.linearColumnrecetas, 3);
        sViewsWithIds.put(R.id.btnRecetas, 4);
        sViewsWithIds.put(R.id.btnDonaciones, 5);
        sViewsWithIds.put(R.id.btnquHacemos, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMenPrincipalBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMenPrincipalBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.imageBamxlogoOne.setTag(null);
        this.linearMenprincipal.setTag(null);
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
        if (BR.menPrincipalVM == variableId) {
            setMenPrincipalVM((com.application.app.modules.menprincipal.data.viewmodel.MenPrincipalVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenPrincipalVM(@Nullable com.application.app.modules.menprincipal.data.viewmodel.MenPrincipalVM MenPrincipalVM) {
        this.mMenPrincipalVM = MenPrincipalVM;
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

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoOne.getContext(), R.drawable.logo_gdl_bamx_ch), imageBamxlogoOne.getResources().getDimension(R.dimen._30pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menPrincipalVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}