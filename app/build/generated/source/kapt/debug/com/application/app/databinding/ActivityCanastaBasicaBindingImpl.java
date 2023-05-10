package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCanastaBasicaBindingImpl extends ActivityCanastaBasicaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmask, 1);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 2);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 3);
        sViewsWithIds.put(R.id.frameStackarrowleft, 4);
        sViewsWithIds.put(R.id.imageArrowleft, 5);
        sViewsWithIds.put(R.id.imageBamxlogoTwoOne, 6);
        sViewsWithIds.put(R.id.imageImageFiftyOne, 7);
        sViewsWithIds.put(R.id.txtH5, 8);
        sViewsWithIds.put(R.id.scrollView, 9);
        sViewsWithIds.put(R.id.fragment1, 10);
        sViewsWithIds.put(R.id.fragment3, 11);
        sViewsWithIds.put(R.id.fragment4, 12);
        sViewsWithIds.put(R.id.fragment2, 13);
        sViewsWithIds.put(R.id.fragment5, 14);
        sViewsWithIds.put(R.id.fragment6, 15);
        sViewsWithIds.put(R.id.fragment7, 16);
        sViewsWithIds.put(R.id.fragment8, 17);
        sViewsWithIds.put(R.id.fragment9, 18);
        sViewsWithIds.put(R.id.fragment10, 19);
        sViewsWithIds.put(R.id.fragment11, 20);
        sViewsWithIds.put(R.id.btnDonar, 21);
        sViewsWithIds.put(R.id.frameBottombar, 22);
        sViewsWithIds.put(R.id.linear2FourupAO, 23);
        sViewsWithIds.put(R.id.linear1Tab, 24);
        sViewsWithIds.put(R.id.imageHome, 25);
        sViewsWithIds.put(R.id.txtCaption, 26);
        sViewsWithIds.put(R.id.linearColumnvolume, 27);
        sViewsWithIds.put(R.id.linear3Tab, 28);
        sViewsWithIds.put(R.id.imageVolume, 29);
        sViewsWithIds.put(R.id.txtCaptionOne, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCanastaBasicaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ActivityCanastaBasicaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[21]
            , (androidx.fragment.app.FragmentContainerView) bindings[10]
            , (androidx.fragment.app.FragmentContainerView) bindings[19]
            , (androidx.fragment.app.FragmentContainerView) bindings[20]
            , (androidx.fragment.app.FragmentContainerView) bindings[13]
            , (androidx.fragment.app.FragmentContainerView) bindings[11]
            , (androidx.fragment.app.FragmentContainerView) bindings[12]
            , (androidx.fragment.app.FragmentContainerView) bindings[14]
            , (androidx.fragment.app.FragmentContainerView) bindings[15]
            , (androidx.fragment.app.FragmentContainerView) bindings[16]
            , (androidx.fragment.app.FragmentContainerView) bindings[17]
            , (androidx.fragment.app.FragmentContainerView) bindings[18]
            , (android.widget.FrameLayout) bindings[22]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ScrollView) bindings[9]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[8]
            );
        this.linearSeleccinalime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}