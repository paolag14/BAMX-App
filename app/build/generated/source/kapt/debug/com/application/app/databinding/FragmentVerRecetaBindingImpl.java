package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentVerRecetaBindingImpl extends FragmentVerRecetaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearRecetas, 2);
        sViewsWithIds.put(R.id.linearRecetasVer, 3);
        sViewsWithIds.put(R.id.imageView, 4);
        sViewsWithIds.put(R.id.textView2, 5);
        sViewsWithIds.put(R.id.txtDescription2, 6);
        sViewsWithIds.put(R.id.textView3, 7);
        sViewsWithIds.put(R.id.txtDescription3, 8);
        sViewsWithIds.put(R.id.link, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentVerRecetaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentVerRecetaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            );
        this.linearColumnmask.setTag(null);
        this.txtH.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.recetasVM == variableId) {
            setRecetasVM((com.application.app.modules.recetas.data.viewmodel.RecetasVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRecetasVM(@Nullable com.application.app.modules.recetas.data.viewmodel.RecetasVM RecetasVM) {
        this.mRecetasVM = RecetasVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.recetasVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRecetasVMRecetasModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.recetas.data.model.RecetasModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRecetasVMRecetasModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.recetas.data.model.RecetasModel> RecetasVMRecetasModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.application.app.modules.recetas.data.model.RecetasModel recetasVMRecetasModelGetValue = null;
        com.application.app.modules.recetas.data.viewmodel.RecetasVM recetasVM = mRecetasVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.recetas.data.model.RecetasModel> recetasVMRecetasModel = null;
        java.lang.String recetasVMRecetasModelTxtH5 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (recetasVM != null) {
                    // read recetasVM.recetasModel
                    recetasVMRecetasModel = recetasVM.getRecetasModel();
                }
                updateLiveDataRegistration(0, recetasVMRecetasModel);


                if (recetasVMRecetasModel != null) {
                    // read recetasVM.recetasModel.getValue()
                    recetasVMRecetasModelGetValue = recetasVMRecetasModel.getValue();
                }


                if (recetasVMRecetasModelGetValue != null) {
                    // read recetasVM.recetasModel.getValue().txtH5
                    recetasVMRecetasModelTxtH5 = recetasVMRecetasModelGetValue.getTxtH5();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH, recetasVMRecetasModelTxtH5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): recetasVM.recetasModel
        flag 1 (0x2L): recetasVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}