# Tic-tac-toe Game
## This is Tic-tac-toe game in Kotline

### step 1. home.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:background="#10e8a3">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Game On"
            android:gravity="center"
            android:textSize="20pt"
            android:fontFamily="casual"
            android:textStyle="bold"
            android:textColor="#0020d6"
            />

    </RelativeLayout>

    <GridLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="8"
        android:alignmentMode="alignMargins"
        android:background="@drawable/background_brics"
        android:columnCount="2"
        android:columnOrderPreserved="false"
        android:padding="14dp"
        android:rowCount="2">

        <android.support.v7.widget.CardView
            android:id="@+id/cpComputer"
            android:onClick="compOpen"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            app:cardCornerRadius="10dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="16dp"
                android:orientation="vertical">

                <ImageView
                    android:id="@+id/imageView"
                    android:layout_width="50pt"
                    android:layout_height="30pt"
                    android:layout_gravity="center_horizontal"
                    android:src="@drawable/ic_computer_black_24dp" />

                <TextView
                    android:id="@+id/textView2"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Computer"
                    android:textAlignment="center"
                    android:textColor="#890660"
                    android:textStyle="bold"

                    />
            </LinearLayout>
        </android.support.v7.widget.CardView>

        <android.support.v7.widget.CardView
            android:id="@+id/cpLocal"
            android:onClick="twoPlayer"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            app:cardCornerRadius="10dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="16dp"
                android:orientation="vertical">

                <ImageView
                    android:id="@+id/imageView2"
                    android:layout_width="50pt"
                    android:layout_height="30pt"
                    android:layout_gravity="center_horizontal"
                    app:srcCompat="@drawable/ic_supervisor_account_black_24dp" />

                <TextView
                    android:id="@+id/textView3"
                    android:textColor="#890660"
                    android:textAlignment="center"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Local Player" />
            </LinearLayout>
        </android.support.v7.widget.CardView>

        <android.support.v7.widget.CardView
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="16dp"
                android:orientation="vertical">

                <ImageView
                    android:id="@+id/imageView3"
                    android:layout_width="50pt"
                    android:layout_height="30pt"
                    android:layout_gravity="center_horizontal"
                    app:srcCompat="@drawable/ic_devices_black_24dp" />

                <TextView
                    android:id="@+id/textView4"
                    android:textColor="#890660"
                    android:textAlignment="center"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Online" />
            </LinearLayout>
        </android.support.v7.widget.CardView>

        <android.support.v7.widget.CardView
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="16dp"
                android:orientation="vertical">

                <ImageView
                    android:id="@+id/imageView4"
                    android:layout_width="50pt"
                    android:layout_height="30pt"
                    android:layout_gravity="center_horizontal"
                    app:srcCompat="@drawable/ic_bluetooth_connected_black_24dp" />

                <TextView
                    android:textColor="#890660"
                    android:textAlignment="center"
                    android:id="@+id/textView5"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Play with friends" />
            </LinearLayout>
        </android.support.v7.widget.CardView>


    </GridLayout>
</LinearLayout>


### step 2. activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    tools:context=".MainActivity"
    android:background="#fffff5"
    >

    <TableRow
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        >

        <Button
            android:textSize="18pt"
            android:id="@+id/button1"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />

        <Button
            android:textSize="18pt"
            android:id="@+id/button2"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />

        <Button
            android:textSize="18pt"
            android:id="@+id/button3"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />
    </TableRow>

    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        >

        <Button
            android:id="@+id/button4"
            android:textSize="18pt"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />

        <Button
            android:textSize="18pt"
            android:id="@+id/button5"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />

        <Button
            android:id="@+id/button6"
            android:textSize="18pt"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />
    </TableRow>

    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        >

        <Button
            android:id="@+id/button7"
            android:textSize="18pt"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />

        <Button
            android:textSize="18pt"
            android:id="@+id/button8"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />

        <Button
            android:id="@+id/button9"
            android:textSize="18pt"
            android:layout_width="40pt"
            android:layout_height="40pt"
            android:layout_margin="3pt"
            android:onClick="btnClick" />
    </TableRow>
</TableLayout>

