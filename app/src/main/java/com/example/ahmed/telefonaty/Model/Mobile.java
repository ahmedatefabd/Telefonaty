package com.example.ahmed.telefonaty.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ahmed on 31/3/2018.
 */

public class Mobile implements Parcelable {

    private String Brand;

    private String weight;

    private String technology;

    private String secondary;

    private String card_slot;

    private String usb;

    private String resolution;

    private String build;

    private String multitouch;

    private String type;

    private String gprs;

    private String _2g_bands;

    private String features;

    private String browser;

    private String dimensions;

    private String gps;

    private String messaging;

    private String internal;

    private String video;

    private String gpu;

    private String protection;

    private String battery_c;

    private String os;

    private String DeviceName;

    private String edge;

    private String sound_c;

    private String wlan;

    private String speed;

    private String status;

    private String colors;

    private String cpu;

    private String _4g_bands;

    private String _3g_bands;

    private String size;

    private String sensors;

    private String bluetooth;

    private String price;

    private String announced;

    private String features_c;

    private String loudspeaker_;

    private String chipset;

    private String primary_;

    private String sim;

    private String radio;

    private String alert_types;

    private String _3_5mm_jack_;

    protected Mobile(Parcel in) {
        Brand = in.readString();
        weight = in.readString();
        technology = in.readString();
        secondary = in.readString();
        card_slot = in.readString();
        usb = in.readString();
        resolution = in.readString();
        build = in.readString();
        multitouch = in.readString();
        type = in.readString();
        gprs = in.readString();
        _2g_bands = in.readString();
        features = in.readString();
        browser = in.readString();
        dimensions = in.readString();
        gps = in.readString();
        messaging = in.readString();
        internal = in.readString();
        video = in.readString();
        gpu = in.readString();
        protection = in.readString();
        battery_c = in.readString();
        os = in.readString();
        DeviceName = in.readString();
        edge = in.readString();
        sound_c = in.readString();
        wlan = in.readString();
        speed = in.readString();
        status = in.readString();
        colors = in.readString();
        cpu = in.readString();
        _4g_bands = in.readString();
        _3g_bands = in.readString();
        size = in.readString();
        sensors = in.readString();
        bluetooth = in.readString();
        price = in.readString();
        announced = in.readString();
        features_c = in.readString();
        loudspeaker_ = in.readString();
        chipset = in.readString();
        primary_ = in.readString();
        sim = in.readString();
        radio = in.readString();
        alert_types = in.readString();
        _3_5mm_jack_ = in.readString();
    }

    public static final Creator<Mobile> CREATOR = new Creator<Mobile>() {
        @Override
        public Mobile createFromParcel(Parcel in) {
            return new Mobile(in);
        }

        @Override
        public Mobile[] newArray(int size) {
            return new Mobile[size];
        }
    };

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getCard_slot() {
        return card_slot;
    }

    public void setCard_slot(String card_slot) {
        this.card_slot = card_slot;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getMultitouch() {
        return multitouch;
    }

    public void setMultitouch(String multitouch) {
        this.multitouch = multitouch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGprs() {
        return gprs;
    }

    public void setGprs(String gprs) {
        this.gprs = gprs;
    }

    public String get_2g_bands() {
        return _2g_bands;
    }

    public void set_2g_bands(String _2g_bands) {
        this._2g_bands = _2g_bands;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getMessaging() {
        return messaging;
    }

    public void setMessaging(String messaging) {
        this.messaging = messaging;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getBattery_c() {
        return battery_c;
    }

    public void setBattery_c(String battery_c) {
        this.battery_c = battery_c;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public String getEdge() {
        return edge;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

    public String getSound_c() {
        return sound_c;
    }

    public void setSound_c(String sound_c) {
        this.sound_c = sound_c;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String get_4g_bands() {
        return _4g_bands;
    }

    public void set_4g_bands(String _4g_bands) {
        this._4g_bands = _4g_bands;
    }

    public String get_3g_bands() {
        return _3g_bands;
    }

    public void set_3g_bands(String _3g_bands) {
        this._3g_bands = _3g_bands;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAnnounced() {
        return announced;
    }

    public void setAnnounced(String announced) {
        this.announced = announced;
    }

    public String getFeatures_c() {
        return features_c;
    }

    public void setFeatures_c(String features_c) {
        this.features_c = features_c;
    }

    public String getLoudspeaker_() {
        return loudspeaker_;
    }

    public void setLoudspeaker_(String loudspeaker_) {
        this.loudspeaker_ = loudspeaker_;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getPrimary_() {
        return primary_;
    }

    public void setPrimary_(String primary_) {
        this.primary_ = primary_;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getAlert_types() {
        return alert_types;
    }

    public void setAlert_types(String alert_types) {
        this.alert_types = alert_types;
    }

    public String get_3_5mm_jack_() {
        return _3_5mm_jack_;
    }

    public void set_3_5mm_jack_(String _3_5mm_jack_) {
        this._3_5mm_jack_ = _3_5mm_jack_;
    }

    @Override
    public String toString() {
        return "ClassPojo [Brand = " + Brand + ", weight = " + weight + ", technology = " + technology + ", secondary = " + secondary + ", card_slot = " + card_slot + ", usb = " + usb + ", resolution = " + resolution + ", build = " + build + ", multitouch = " + multitouch + ", type = " + type + ", gprs = " + gprs + ", _2g_bands = " + _2g_bands + ", features = " + features + ", browser = " + browser + ", dimensions = " + dimensions + ", gps = " + gps + ", messaging = " + messaging + ", internal = " + internal + ", video = " + video + ", gpu = " + gpu + ", protection = " + protection + ", battery_c = " + battery_c + ", os = " + os + ", DeviceName = " + DeviceName + ", edge = " + edge + ", sound_c = " + sound_c + ", wlan = " + wlan + ", speed = " + speed + ", status = " + status + ", colors = " + colors + ", cpu = " + cpu + ", _4g_bands = " + _4g_bands + ", _3g_bands = " + _3g_bands + ", size = " + size + ", sensors = " + sensors + ", bluetooth = " + bluetooth + ", price = " + price + ", announced = " + announced + ", features_c = " + features_c + ", loudspeaker_ = " + loudspeaker_ + ", chipset = " + chipset + ", primary_ = " + primary_ + ", sim = " + sim + ", radio = " + radio + ", alert_types = " + alert_types + ", _3_5mm_jack_ = " + _3_5mm_jack_ + "]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Brand);
        parcel.writeString(weight);
        parcel.writeString(technology);
        parcel.writeString(secondary);
        parcel.writeString(card_slot);
        parcel.writeString(usb);
        parcel.writeString(resolution);
        parcel.writeString(build);
        parcel.writeString(multitouch);
        parcel.writeString(type);
        parcel.writeString(gprs);
        parcel.writeString(_2g_bands);
        parcel.writeString(features);
        parcel.writeString(browser);
        parcel.writeString(dimensions);
        parcel.writeString(gps);
        parcel.writeString(messaging);
        parcel.writeString(internal);
        parcel.writeString(video);
        parcel.writeString(gpu);
        parcel.writeString(protection);
        parcel.writeString(battery_c);
        parcel.writeString(os);
        parcel.writeString(DeviceName);
        parcel.writeString(edge);
        parcel.writeString(sound_c);
        parcel.writeString(wlan);
        parcel.writeString(speed);
        parcel.writeString(status);
        parcel.writeString(colors);
        parcel.writeString(cpu);
        parcel.writeString(_4g_bands);
        parcel.writeString(_3g_bands);
        parcel.writeString(size);
        parcel.writeString(sensors);
        parcel.writeString(bluetooth);
        parcel.writeString(price);
        parcel.writeString(announced);
        parcel.writeString(features_c);
        parcel.writeString(loudspeaker_);
        parcel.writeString(chipset);
        parcel.writeString(primary_);
        parcel.writeString(sim);
        parcel.writeString(radio);
        parcel.writeString(alert_types);
        parcel.writeString(_3_5mm_jack_);
    }
}
