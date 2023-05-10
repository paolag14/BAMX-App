package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowListlabelBindingImpl extends RowListlabelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageLabel, 2);
        sViewsWithIds.put(R.id.linearNombres, 3);
        sViewsWithIds.put(R.id.lineUpperSurface, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowListlabelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowListlabelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.view.View) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.frameAInactiveEna.setTag(null);
        this.txtLabelOne.setTag(null);
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
        if (BR.listlabelRowModel == variableId) {
            setListlabelRowModel((com.application.app.modules.formulariodonacin.data.model.ListlabelRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListlabelRowModel(@Nullable com.application.app.modules.formulariodonacin.data.model.ListlabelRowModel ListlabelRowModel) {
        this.mListlabelRowModel = ListlabelRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listlabelRowModel);
        super.requestRebind();
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
        java.lang.String listlabelRowModelTxtLabelOne = null;
        com.application.app.modules.formulariodonacin.data.model.ListlabelRowModel listlabelRowModel = mListlabelRowModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listlabelRowModel != null) {
                    // read listlabelRowModel.txtLabelOne
                    listlabelRowModelTxtLabelOne = listlabelRowModel.getTxtLabelOne();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLabelOne, listlabelRowModelTxtLabelOne);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listlabelRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}