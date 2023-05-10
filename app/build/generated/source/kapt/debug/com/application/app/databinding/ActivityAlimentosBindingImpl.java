package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAlimentosBindingImpl extends ActivityAlimentosBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmask, 6);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 7);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 8);
        sViewsWithIds.put(R.id.frameStackarrowleft, 9);
        sViewsWithIds.put(R.id.imageArrowleft, 10);
        sViewsWithIds.put(R.id.linearColumnlabel, 11);
        sViewsWithIds.put(R.id.linearRowlabel, 12);
        sViewsWithIds.put(R.id.linear3ContainedB, 13);
        sViewsWithIds.put(R.id.btnCanastaBasica, 14);
        sViewsWithIds.put(R.id.linear3ContainedB1, 15);
        sViewsWithIds.put(R.id.btnFrutasYVerduras, 16);
        sViewsWithIds.put(R.id.linearRowlabelTwo, 17);
        sViewsWithIds.put(R.id.linear3ContainedB2, 18);
        sViewsWithIds.put(R.id.btnEmbutidosYLacteos, 19);
        sViewsWithIds.put(R.id.linear3ContainedB3, 20);
        sViewsWithIds.put(R.id.btnAbarrotes, 21);
        sViewsWithIds.put(R.id.btnOtro, 22);
        sViewsWithIds.put(R.id.frameBottombar, 23);
        sViewsWithIds.put(R.id.linear2FourupAO, 24);
        sViewsWithIds.put(R.id.linear1Tab, 25);
        sViewsWithIds.put(R.id.imageHome, 26);
        sViewsWithIds.put(R.id.linearColumnvolume, 27);
        sViewsWithIds.put(R.id.linear3Tab, 28);
        sViewsWithIds.put(R.id.imageVolume, 29);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAlimentosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityAlimentosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[21]
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (androidx.appcompat.widget.AppCompatButton) bindings[19]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (androidx.appcompat.widget.AppCompatButton) bindings[22]
            , (android.widget.FrameLayout) bindings[23]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearAlimentos.setTag(null);
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
        if (BR.alimentosVM == variableId) {
            setAlimentosVM((com.application.app.modules.alimentos.data.viewmodel.AlimentosVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAlimentosVM(@Nullable com.application.app.modules.alimentos.data.viewmodel.AlimentosVM AlimentosVM) {
        this.mAlimentosVM = AlimentosVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.alimentosVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAlimentosVMAlimentosModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.alimentos.data.model.AlimentosModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAlimentosVMAlimentosModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.alimentos.data.model.AlimentosModel> AlimentosVMAlimentosModel, int fieldId) {
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
        java.lang.String alimentosVMAlimentosModelTxtH5 = null;
        com.application.app.modules.alimentos.data.model.AlimentosModel alimentosVMAlimentosModelGetValue = null;
        java.lang.String alimentosVMAlimentosModelTxtCaptionOne = null;
        java.lang.String alimentosVMAlimentosModelTxtCaption = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.alimentos.data.model.AlimentosModel> alimentosVMAlimentosModel = null;
        com.application.app.modules.alimentos.data.viewmodel.AlimentosVM alimentosVM = mAlimentosVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (alimentosVM != null) {
                    // read alimentosVM.alimentosModel
                    alimentosVMAlimentosModel = alimentosVM.getAlimentosModel();
                }
                updateLiveDataRegistration(0, alimentosVMAlimentosModel);


                if (alimentosVMAlimentosModel != null) {
                    // read alimentosVM.alimentosModel.getValue()
                    alimentosVMAlimentosModelGetValue = alimentosVMAlimentosModel.getValue();
                }


                if (alimentosVMAlimentosModelGetValue != null) {
                    // read alimentosVM.alimentosModel.getValue().txtH5
                    alimentosVMAlimentosModelTxtH5 = alimentosVMAlimentosModelGetValue.getTxtH5();
                    // read alimentosVM.alimentosModel.getValue().txtCaptionOne
                    alimentosVMAlimentosModelTxtCaptionOne = alimentosVMAlimentosModelGetValue.getTxtCaptionOne();
                    // read alimentosVM.alimentosModel.getValue().txtCaption
                    alimentosVMAlimentosModelTxtCaption = alimentosVMAlimentosModelGetValue.getTxtCaption();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_2), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_3), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaption, alimentosVMAlimentosModelTxtCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaptionOne, alimentosVMAlimentosModelTxtCaptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5, alimentosVMAlimentosModelTxtH5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): alimentosVM.alimentosModel
        flag 1 (0x2L): alimentosVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}