package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDineroBindingImpl extends ActivityDineroBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearDinero, 9);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 10);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 11);
        sViewsWithIds.put(R.id.frameStackarrowleft, 12);
        sViewsWithIds.put(R.id.imageArrowleft, 13);
        sViewsWithIds.put(R.id.txtH5, 14);
        sViewsWithIds.put(R.id.btn100Zero, 15);
        sViewsWithIds.put(R.id.btn200Zero, 16);
        sViewsWithIds.put(R.id.btn500Zero, 17);
        sViewsWithIds.put(R.id.btnEnviarDonacinOne, 18);
        sViewsWithIds.put(R.id.linear2FourupAO, 19);
        sViewsWithIds.put(R.id.linear1Tab, 20);
        sViewsWithIds.put(R.id.imageHome, 21);
        sViewsWithIds.put(R.id.linearColumnvolume, 22);
        sViewsWithIds.put(R.id.linear3Tab, 23);
        sViewsWithIds.put(R.id.imageVolume, 24);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener dineroandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of dineroVM.dineroModel.getValue().etBoxValue
            //         is dineroVM.dineroModel.getValue().setEtBoxValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(dinero);
            // localize variables for thread safety
            // dineroVM.dineroModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.dinero.data.model.DineroModel> dineroVMDineroModel = null;
            // dineroVM.dineroModel.getValue().etBoxValue
            java.lang.String dineroVMDineroModelEtBoxValue = null;
            // dineroVM.dineroModel != null
            boolean dineroVMDineroModelJavaLangObjectNull = false;
            // dineroVM != null
            boolean dineroVMJavaLangObjectNull = false;
            // dineroVM.dineroModel.getValue() != null
            boolean dineroVMDineroModelGetValueJavaLangObjectNull = false;
            // dineroVM.dineroModel.getValue()
            com.application.app.modules.dinero.data.model.DineroModel dineroVMDineroModelGetValue = null;
            // dineroVM
            com.application.app.modules.dinero.data.viewmodel.DineroVM dineroVM = mDineroVM;



            dineroVMJavaLangObjectNull = (dineroVM) != (null);
            if (dineroVMJavaLangObjectNull) {


                dineroVMDineroModel = dineroVM.getDineroModel();

                dineroVMDineroModelJavaLangObjectNull = (dineroVMDineroModel) != (null);
                if (dineroVMDineroModelJavaLangObjectNull) {


                    dineroVMDineroModelGetValue = dineroVMDineroModel.getValue();

                    dineroVMDineroModelGetValueJavaLangObjectNull = (dineroVMDineroModelGetValue) != (null);
                    if (dineroVMDineroModelGetValueJavaLangObjectNull) {




                        dineroVMDineroModelGetValue.setEtBoxValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityDineroBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivityDineroBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (androidx.appcompat.widget.AppCompatButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (android.widget.EditText) bindings[6]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[11]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.dinero.setTag(null);
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearColumnmask.setTag(null);
        this.txtCaption.setTag(null);
        this.txtCaptionOne.setTag(null);
        this.txtDescription.setTag(null);
        this.txtH5One.setTag(null);
        this.txtH5Two.setTag(null);
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
        if (BR.dineroVM == variableId) {
            setDineroVM((com.application.app.modules.dinero.data.viewmodel.DineroVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDineroVM(@Nullable com.application.app.modules.dinero.data.viewmodel.DineroVM DineroVM) {
        this.mDineroVM = DineroVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dineroVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDineroVMDineroModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.dinero.data.model.DineroModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDineroVMDineroModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.dinero.data.model.DineroModel> DineroVMDineroModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.dinero.data.model.DineroModel> dineroVMDineroModel = null;
        java.lang.String dineroVMDineroModelTxtDescription = null;
        java.lang.String dineroVMDineroModelTxtH5Two = null;
        com.application.app.modules.dinero.data.viewmodel.DineroVM dineroVM = mDineroVM;
        java.lang.String dineroVMDineroModelTxtCaption = null;
        java.lang.String dineroVMDineroModelTxtH5One = null;
        com.application.app.modules.dinero.data.model.DineroModel dineroVMDineroModelGetValue = null;
        java.lang.String dineroVMDineroModelEtBoxValue = null;
        java.lang.String dineroVMDineroModelTxtCaptionOne = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (dineroVM != null) {
                    // read dineroVM.dineroModel
                    dineroVMDineroModel = dineroVM.getDineroModel();
                }
                updateLiveDataRegistration(0, dineroVMDineroModel);


                if (dineroVMDineroModel != null) {
                    // read dineroVM.dineroModel.getValue()
                    dineroVMDineroModelGetValue = dineroVMDineroModel.getValue();
                }


                if (dineroVMDineroModelGetValue != null) {
                    // read dineroVM.dineroModel.getValue().txtDescription
                    dineroVMDineroModelTxtDescription = dineroVMDineroModelGetValue.getTxtDescription();
                    // read dineroVM.dineroModel.getValue().txtH5Two
                    dineroVMDineroModelTxtH5Two = dineroVMDineroModelGetValue.getTxtH5Two();
                    // read dineroVM.dineroModel.getValue().txtCaption
                    dineroVMDineroModelTxtCaption = dineroVMDineroModelGetValue.getTxtCaption();
                    // read dineroVM.dineroModel.getValue().txtH5One
                    dineroVMDineroModelTxtH5One = dineroVMDineroModelGetValue.getTxtH5One();
                    // read dineroVM.dineroModel.getValue().etBoxValue
                    dineroVMDineroModelEtBoxValue = dineroVMDineroModelGetValue.getEtBoxValue();
                    // read dineroVM.dineroModel.getValue().txtCaptionOne
                    dineroVMDineroModelTxtCaptionOne = dineroVMDineroModelGetValue.getTxtCaptionOne();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dinero, dineroVMDineroModelEtBoxValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaption, dineroVMDineroModelTxtCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaptionOne, dineroVMDineroModelTxtCaptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, dineroVMDineroModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5One, dineroVMDineroModelTxtH5One);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5Two, dineroVMDineroModelTxtH5Two);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.dinero, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, dineroandroidTextAttrChanged);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_16), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_17), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dineroVM.dineroModel
        flag 1 (0x2L): dineroVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}