package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFormularioOtroAlimentoBindingImpl extends ActivityFormularioOtroAlimentoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmask, 6);
        sViewsWithIds.put(R.id.frameStack, 7);
        sViewsWithIds.put(R.id.linearColumn, 8);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 9);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 10);
        sViewsWithIds.put(R.id.frameStackarrowleft, 11);
        sViewsWithIds.put(R.id.imageArrowleft, 12);
        sViewsWithIds.put(R.id.FrutasVerdurasFrame, 13);
        sViewsWithIds.put(R.id.frutasVerdurasInput, 14);
        sViewsWithIds.put(R.id.imageLabelFour, 15);
        sViewsWithIds.put(R.id.linearLabel, 16);
        sViewsWithIds.put(R.id.txtLabelFrutasVerduras, 17);
        sViewsWithIds.put(R.id.lineUpperSurface, 18);
        sViewsWithIds.put(R.id.NoPerecederosFrame, 19);
        sViewsWithIds.put(R.id.noPerecederosInput, 20);
        sViewsWithIds.put(R.id.imageLabelFive, 21);
        sViewsWithIds.put(R.id.linearLabel2, 22);
        sViewsWithIds.put(R.id.txtLabelNoPerecederos, 23);
        sViewsWithIds.put(R.id.lineUpperSurfaceTwo, 24);
        sViewsWithIds.put(R.id.btnDonar, 25);
        sViewsWithIds.put(R.id.frameBottombar, 26);
        sViewsWithIds.put(R.id.linear2FourupAO, 27);
        sViewsWithIds.put(R.id.linear1Tab, 28);
        sViewsWithIds.put(R.id.imageHome, 29);
        sViewsWithIds.put(R.id.linearColumnvolume, 30);
        sViewsWithIds.put(R.id.linear3Tab, 31);
        sViewsWithIds.put(R.id.imageVolume, 32);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFormularioOtroAlimentoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivityFormularioOtroAlimentoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[19]
            , (androidx.appcompat.widget.AppCompatButton) bindings[25]
            , (android.widget.FrameLayout) bindings[26]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.EditText) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[32]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[24]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.EditText) bindings[20]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[23]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearFormularioOtro.setTag(null);
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
        if (BR.formularioOtroAlimentoVM == variableId) {
            setFormularioOtroAlimentoVM((com.application.app.modules.formulariootroalimento.data.viewmodel.FormularioOtroAlimentoVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFormularioOtroAlimentoVM(@Nullable com.application.app.modules.formulariootroalimento.data.viewmodel.FormularioOtroAlimentoVM FormularioOtroAlimentoVM) {
        this.mFormularioOtroAlimentoVM = FormularioOtroAlimentoVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.formularioOtroAlimentoVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFormularioOtroAlimentoVMFormularioOtroAlimentoModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.formulariootroalimento.data.model.FormularioOtroAlimentoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFormularioOtroAlimentoVMFormularioOtroAlimentoModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.formulariootroalimento.data.model.FormularioOtroAlimentoModel> FormularioOtroAlimentoVMFormularioOtroAlimentoModel, int fieldId) {
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
        com.application.app.modules.formulariootroalimento.data.model.FormularioOtroAlimentoModel formularioOtroAlimentoVMFormularioOtroAlimentoModelGetValue = null;
        java.lang.String formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtH5 = null;
        java.lang.String formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtCaption = null;
        java.lang.String formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtCaptionOne = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.formulariootroalimento.data.model.FormularioOtroAlimentoModel> formularioOtroAlimentoVMFormularioOtroAlimentoModel = null;
        com.application.app.modules.formulariootroalimento.data.viewmodel.FormularioOtroAlimentoVM formularioOtroAlimentoVM = mFormularioOtroAlimentoVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (formularioOtroAlimentoVM != null) {
                    // read formularioOtroAlimentoVM.formularioOtroAlimentoModel
                    formularioOtroAlimentoVMFormularioOtroAlimentoModel = formularioOtroAlimentoVM.getFormularioOtroAlimentoModel();
                }
                updateLiveDataRegistration(0, formularioOtroAlimentoVMFormularioOtroAlimentoModel);


                if (formularioOtroAlimentoVMFormularioOtroAlimentoModel != null) {
                    // read formularioOtroAlimentoVM.formularioOtroAlimentoModel.getValue()
                    formularioOtroAlimentoVMFormularioOtroAlimentoModelGetValue = formularioOtroAlimentoVMFormularioOtroAlimentoModel.getValue();
                }


                if (formularioOtroAlimentoVMFormularioOtroAlimentoModelGetValue != null) {
                    // read formularioOtroAlimentoVM.formularioOtroAlimentoModel.getValue().txtH5
                    formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtH5 = formularioOtroAlimentoVMFormularioOtroAlimentoModelGetValue.getTxtH5();
                    // read formularioOtroAlimentoVM.formularioOtroAlimentoModel.getValue().txtCaption
                    formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtCaption = formularioOtroAlimentoVMFormularioOtroAlimentoModelGetValue.getTxtCaption();
                    // read formularioOtroAlimentoVM.formularioOtroAlimentoModel.getValue().txtCaptionOne
                    formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtCaptionOne = formularioOtroAlimentoVMFormularioOtroAlimentoModelGetValue.getTxtCaptionOne();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_10), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_11), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaption, formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaptionOne, formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtCaptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5, formularioOtroAlimentoVMFormularioOtroAlimentoModelTxtH5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): formularioOtroAlimentoVM.formularioOtroAlimentoModel
        flag 1 (0x2L): formularioOtroAlimentoVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}