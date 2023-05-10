package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFormularioDonaciNBindingImpl extends ActivityFormularioDonaciNBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmask, 7);
        sViewsWithIds.put(R.id.frameSystembar, 8);
        sViewsWithIds.put(R.id.imageMask, 9);
        sViewsWithIds.put(R.id.frameStack, 10);
        sViewsWithIds.put(R.id.linearColumn, 11);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 12);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 13);
        sViewsWithIds.put(R.id.frameStackarrowleft, 14);
        sViewsWithIds.put(R.id.imageArrowleft, 15);
        sViewsWithIds.put(R.id.btnDonar, 16);
        sViewsWithIds.put(R.id.frameBottombar, 17);
        sViewsWithIds.put(R.id.linear2FourupAO, 18);
        sViewsWithIds.put(R.id.linear1Tab, 19);
        sViewsWithIds.put(R.id.imageHome, 20);
        sViewsWithIds.put(R.id.linearColumnvolume, 21);
        sViewsWithIds.put(R.id.linear3Tab, 22);
        sViewsWithIds.put(R.id.imageVolume, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFormularioDonaciNBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityFormularioDonaciNBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (android.widget.FrameLayout) bindings[17]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearFormulariodona.setTag(null);
        this.recyclerListlabel.setTag(null);
        this.txtCaption.setTag(null);
        this.txtCaptionOne.setTag(null);
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
        if (BR.formularioDonaciNVM == variableId) {
            setFormularioDonaciNVM((com.application.app.modules.formulariodonacin.data.viewmodel.FormularioDonaciNVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFormularioDonaciNVM(@Nullable com.application.app.modules.formulariodonacin.data.viewmodel.FormularioDonaciNVM FormularioDonaciNVM) {
        this.mFormularioDonaciNVM = FormularioDonaciNVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.formularioDonaciNVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFormularioDonaciNVMFormularioDonaciNModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.formulariodonacin.data.model.FormularioDonaciNModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFormularioDonaciNVMFormularioDonaciNModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.formulariodonacin.data.model.FormularioDonaciNModel> FormularioDonaciNVMFormularioDonaciNModel, int fieldId) {
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
        com.application.app.modules.formulariodonacin.data.model.FormularioDonaciNModel formularioDonaciNVMFormularioDonaciNModelGetValue = null;
        java.lang.String formularioDonaciNVMFormularioDonaciNModelTxtH5 = null;
        java.lang.String formularioDonaciNVMFormularioDonaciNModelTxtCaption = null;
        java.lang.String formularioDonaciNVMFormularioDonaciNModelTxtCaptionOne = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.formulariodonacin.data.model.FormularioDonaciNModel> formularioDonaciNVMFormularioDonaciNModel = null;
        com.application.app.modules.formulariodonacin.data.viewmodel.FormularioDonaciNVM formularioDonaciNVM = mFormularioDonaciNVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (formularioDonaciNVM != null) {
                    // read formularioDonaciNVM.formularioDonaciNModel
                    formularioDonaciNVMFormularioDonaciNModel = formularioDonaciNVM.getFormularioDonaciNModel();
                }
                updateLiveDataRegistration(0, formularioDonaciNVMFormularioDonaciNModel);


                if (formularioDonaciNVMFormularioDonaciNModel != null) {
                    // read formularioDonaciNVM.formularioDonaciNModel.getValue()
                    formularioDonaciNVMFormularioDonaciNModelGetValue = formularioDonaciNVMFormularioDonaciNModel.getValue();
                }


                if (formularioDonaciNVMFormularioDonaciNModelGetValue != null) {
                    // read formularioDonaciNVM.formularioDonaciNModel.getValue().txtH5
                    formularioDonaciNVMFormularioDonaciNModelTxtH5 = formularioDonaciNVMFormularioDonaciNModelGetValue.getTxtH5();
                    // read formularioDonaciNVM.formularioDonaciNModel.getValue().txtCaption
                    formularioDonaciNVMFormularioDonaciNModelTxtCaption = formularioDonaciNVMFormularioDonaciNModelGetValue.getTxtCaption();
                    // read formularioDonaciNVM.formularioDonaciNModel.getValue().txtCaptionOne
                    formularioDonaciNVMFormularioDonaciNModelTxtCaptionOne = formularioDonaciNVMFormularioDonaciNModelGetValue.getTxtCaptionOne();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_8), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_9), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerListlabel, recyclerListlabel.getResources().getDimension(R.dimen._27pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaption, formularioDonaciNVMFormularioDonaciNModelTxtCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaptionOne, formularioDonaciNVMFormularioDonaciNModelTxtCaptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5, formularioDonaciNVMFormularioDonaciNModelTxtH5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): formularioDonaciNVM.formularioDonaciNModel
        flag 1 (0x2L): formularioDonaciNVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}