package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityQhacemosBindingImpl extends ActivityQhacemosBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearQhacemos, 13);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 14);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 15);
        sViewsWithIds.put(R.id.frameStackarrowleft, 16);
        sViewsWithIds.put(R.id.imageArrowleft, 17);
        sViewsWithIds.put(R.id.txtH8, 18);
        sViewsWithIds.put(R.id.txtH5, 19);
        sViewsWithIds.put(R.id.txtH6, 20);
        sViewsWithIds.put(R.id.txtH7, 21);
        sViewsWithIds.put(R.id.frameBottombar, 22);
        sViewsWithIds.put(R.id.linear2FourupAO, 23);
        sViewsWithIds.put(R.id.linear1Tab, 24);
        sViewsWithIds.put(R.id.imageHome, 25);
        sViewsWithIds.put(R.id.linearColumnvolume, 26);
        sViewsWithIds.put(R.id.linear3Tab, 27);
        sViewsWithIds.put(R.id.imageVolume, 28);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityQhacemosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityQhacemosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[22]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[9]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.imageEllipseFive.setTag(null);
        this.imageEllipseSix.setTag(null);
        this.imageImageSix.setTag(null);
        this.imageImageThree.setTag(null);
        this.imageImageTwo.setTag(null);
        this.linearColumnmask.setTag(null);
        this.txtCaption.setTag(null);
        this.txtCaptionOne.setTag(null);
        this.txtDescription.setTag(null);
        this.txtDescriptionOne.setTag(null);
        this.txtWeight.setTag(null);
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
        if (BR.qhacemosVM == variableId) {
            setQhacemosVM((com.application.app.modules.qhacemos.data.viewmodel.QhacemosVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQhacemosVM(@Nullable com.application.app.modules.qhacemos.data.viewmodel.QhacemosVM QhacemosVM) {
        this.mQhacemosVM = QhacemosVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.qhacemosVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeQhacemosVMQhacemosModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.qhacemos.data.model.QhacemosModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeQhacemosVMQhacemosModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.qhacemos.data.model.QhacemosModel> QhacemosVMQhacemosModel, int fieldId) {
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
        java.lang.String qhacemosVMQhacemosModelTxtCaption = null;
        java.lang.String qhacemosVMQhacemosModelTxtWeight = null;
        java.lang.String qhacemosVMQhacemosModelTxtCaptionOne = null;
        com.application.app.modules.qhacemos.data.model.QhacemosModel qhacemosVMQhacemosModelGetValue = null;
        java.lang.String qhacemosVMQhacemosModelTxtDescription = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.qhacemos.data.model.QhacemosModel> qhacemosVMQhacemosModel = null;
        com.application.app.modules.qhacemos.data.viewmodel.QhacemosVM qhacemosVM = mQhacemosVM;
        java.lang.String qhacemosVMQhacemosModelTxtDescriptionOne = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (qhacemosVM != null) {
                    // read qhacemosVM.qhacemosModel
                    qhacemosVMQhacemosModel = qhacemosVM.getQhacemosModel();
                }
                updateLiveDataRegistration(0, qhacemosVMQhacemosModel);


                if (qhacemosVMQhacemosModel != null) {
                    // read qhacemosVM.qhacemosModel.getValue()
                    qhacemosVMQhacemosModelGetValue = qhacemosVMQhacemosModel.getValue();
                }


                if (qhacemosVMQhacemosModelGetValue != null) {
                    // read qhacemosVM.qhacemosModel.getValue().txtCaption
                    qhacemosVMQhacemosModelTxtCaption = qhacemosVMQhacemosModelGetValue.getTxtCaption();
                    // read qhacemosVM.qhacemosModel.getValue().txtWeight
                    qhacemosVMQhacemosModelTxtWeight = qhacemosVMQhacemosModelGetValue.getTxtWeight();
                    // read qhacemosVM.qhacemosModel.getValue().txtCaptionOne
                    qhacemosVMQhacemosModelTxtCaptionOne = qhacemosVMQhacemosModelGetValue.getTxtCaptionOne();
                    // read qhacemosVM.qhacemosModel.getValue().txtDescription
                    qhacemosVMQhacemosModelTxtDescription = qhacemosVMQhacemosModelGetValue.getTxtDescription();
                    // read qhacemosVM.qhacemosModel.getValue().txtDescriptionOne
                    qhacemosVMQhacemosModelTxtDescriptionOne = qhacemosVMQhacemosModelGetValue.getTxtDescriptionOne();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_18), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_19), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseFive, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseFive.getContext(), R.drawable.img_ellipse5), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseSix, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseSix.getContext(), R.drawable.img_ellipse6), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageSix, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageSix.getContext(), R.drawable.img_image6), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageThree, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageThree.getContext(), R.drawable.img_image3), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageTwo.getContext(), R.drawable.img_image2), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaption, qhacemosVMQhacemosModelTxtCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaptionOne, qhacemosVMQhacemosModelTxtCaptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, qhacemosVMQhacemosModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescriptionOne, qhacemosVMQhacemosModelTxtDescriptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeight, qhacemosVMQhacemosModelTxtWeight);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): qhacemosVM.qhacemosModel
        flag 1 (0x2L): qhacemosVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}