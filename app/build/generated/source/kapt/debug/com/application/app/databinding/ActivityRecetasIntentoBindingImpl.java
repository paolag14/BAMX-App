package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRecetasIntentoBindingImpl extends ActivityRecetasIntentoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearRecetas, 4);
        sViewsWithIds.put(R.id.frameStack, 5);
        sViewsWithIds.put(R.id.linearColumn, 6);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 7);
        sViewsWithIds.put(R.id.frameStackarrowleft, 8);
        sViewsWithIds.put(R.id.linearRowarrowleft, 9);
        sViewsWithIds.put(R.id.imageArrowleft, 10);
        sViewsWithIds.put(R.id.imageSearch, 11);
        sViewsWithIds.put(R.id.recyclerViewRecetas, 12);
        sViewsWithIds.put(R.id.frameBottombar, 13);
        sViewsWithIds.put(R.id.linear2FourupAO, 14);
        sViewsWithIds.put(R.id.linear1Tab, 15);
        sViewsWithIds.put(R.id.imageHome, 16);
        sViewsWithIds.put(R.id.txtCaption, 17);
        sViewsWithIds.put(R.id.linearColumnvolume, 18);
        sViewsWithIds.put(R.id.linear3Tab, 19);
        sViewsWithIds.put(R.id.imageVolume, 20);
        sViewsWithIds.put(R.id.txtCaptionOne, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRecetasIntentoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityRecetasIntentoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[1]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearColumnmask.setTag(null);
        this.txtH5.setTag(null);
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
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_20), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_21), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5, recetasVMRecetasModelTxtH5);
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